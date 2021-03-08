var logo_moon = '<svg xmlns="http://www.w3.org/2000/svg" width="16px" height="16px" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-moon"><path d="M21 12.79A9 9 0 1 1 11.21 3 7 7 0 0 0 21 12.79z"></path></svg>';
var logo_sun = '<svg xmlns="http://www.w3.org/2000/svg" width="16px" height="16px" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-sun"><circle cx="12" cy="12" r="5"></circle><line x1="12" y1="1" x2="12" y2="3"></line><line x1="12" y1="21" x2="12" y2="23"></line><line x1="4.22" y1="4.22" x2="5.64" y2="5.64"></line><line x1="18.36" y1="18.36" x2="19.78" y2="19.78"></line><line x1="1" y1="12" x2="3" y2="12"></line><line x1="21" y1="12" x2="23" y2="12"></line><line x1="4.22" y1="19.78" x2="5.64" y2="18.36"></line><line x1="18.36" y1="5.64" x2="19.78" y2="4.22"></line></svg>';
var logo_text = '<span class="visible-xs-inline">&nbsp;模式切换</span>';
var target = $("#header > div.collapse.pos-rlt.navbar-collapse.bg-white > ul.nav.navbar-nav.navbar-right > li:nth-child(3) > a");
var mode_start_time = 18;
var mode_end_time = 6;

function switchMode(mode) {
    let time = new Date();
    let hour = time.getHours();
    let expire = new Date();
    if (hour >= mode_start_time) {
        expire.setHours(6, 0, 0, 0);
        expire.setDate(expire.getDate() + 1);
    } else if (hour < mode_end_time) {
        expire.setHours(6, 0, 0, 0);
    } else {
        expire.setHours(18, 0, 0, 0);
    }
    if (mode.data === "auto") {
        if ("light" === handsome_UI.mode) {
            handsome_UI.dark_mode();
            Cookies.set('is_dark_mode', 'true', {expires: expire});
        } else if ("dark" === handsome_UI.mode) {
            Cookies.set('is_dark_mode', 'false', {expires: expire});
            handsome_UI.light_mode();
        }
    } else {
        if (mode === "dark") {
            handsome_UI.dark_mode();
        } else {
            handsome_UI.light_mode();
        }
    }
    checkMode();
}

function checkMode() {
    if ("light" === handsome_UI.mode) {
        target.html(logo_moon + logo_text);
    } else if ("dark" === handsome_UI.mode) {
        target.html(logo_sun + logo_text);
    }
    target.blur();
}

$(window).load(function () {
    target.removeAttr("href");// 移除a标签属性
    target.click("auto", switchMode);// 注册监听
    let isDark = Cookies.get("is_dark_mode");// 读取Cookie，判断是否手动指定了颜色
    let hour = new Date().getHours();
    if (isDark == null) {
        console.log("检测到首次加载，使用自动配置>当前时间：" + hour + "点");
        if(window.matchMedia('(prefers-color-scheme)').media === 'not all'){
            console.log("不支持跟随系统设置，将根据时间进行判断");
            if (hour >= mode_start_time || hour < mode_end_time) {
                switchMode("dark");
                $.message({message: "已为您自动启用夜间模式", autoHide: true, time: 3000});
            } else {
                switchMode("light");
                $.message({message: "已为您自动启用白天模式", autoHide: true, time: 3000});
            }
        }else{
            let listeners={
                dark:(mediaQueryList )=>{
                    if(mediaQueryList.matches){
                        switchMode("dark");
                        $.message({message: "已为您自动启用夜间模式", autoHide: true, time: 5000});
                    }
                },
                light:(mediaQueryList)=>{
                    if(mediaQueryList.matches){
                        switchMode("light");
                        $.message({message: "已为您自动启用白天模式", autoHide: true, time: 5000});
                    }
                }
            }
            window.matchMedia('(prefers-color-scheme: dark)').addListener(listeners.dark)
            window.matchMedia('(prefers-color-scheme: light)').addListener(listeners.light)
        }
    } else {
        console.log("读取到缓存中黑暗模式设置为：" + isDark, "正在启用之前的设置");
        if (isDark === "true") {
            switchMode("dark");
        } else {
            switchMode("light");
        }
    }
});

