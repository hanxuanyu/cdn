package beans;

import java.util.List;

public class ResultBean {
    /**
     * httpstatus : 200
     * data : {"result":["|列车运行图调整,暂停发售|27000D336100|D3361|TNV|JGF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D336110|D3361|TNV|JGF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D336300|D3363|TNV|JOF|TNV|CAF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D334700|D3347|TNV|ZZF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D334700|D3347|TNV|ZZF|TNV|CAF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D336500|D3365|TNV|CUF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D337100|D3371|TNV|JOF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000G313500|G3135|TNV|NGH|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","2xogFJotbFGmnQZYRdqAIGCZX7ikznvgxnfeUGys3rn6iMs%2FYDx888oIkdKjhJIpF448LQ7iDY7w%0AvUdDfVQSdT6D92qB%2B3p4J1OqcWllYcd%2BzBpFkorXIIFwtvvVSpOiebyPyXI8UgsNdFrSEJ2DJMXs%0Avof%2BbNKFf96ng9GS6rd03SpBT1pHD6F7fNMkS0n3zpUVSHp05ZADItIRO91KF6W%2FURgzPATy6KbN%0A0%2Fyd5hZcvq9U0O6BfQVYSCqHTZKXPOdfDddo6Tq4gJRUbxHfc60hD8s7A%2FzZpCNxgROBfgnVx8q8%0Ak8V5Pw62Immvj2OG|预订|270000K90324|K903|TYV|XKS|TYV|CBF|11:11|16:20|05:09|Y|rdMgG%2FzKIznFSrlmSzK7YSTrgjX16fo5SwYi%2FVsQtcsWlduE8mKv8ADsQYg%3D|20210205|3|V1|01|07|1|0||||2|||无||14|有|||||304010W0|3411|1|0||3008750014401325000210041500211004153000|0|||||1|#0#0|","Y2BCbbY9py0Cv4SDYh6OxktpD93LzkBYWKGY3uMzvbz6CVwNh9y5W7kLekzel5tzR9PFf1S3oOnt%0A5Z12OsUH%2FIvb9U6613RIoiHRa04BNgMtG3CZ4MXdtwARNHi%2Fjx5eSv8%2FBuNJnqtFsciF4B5JiReN%0AKZb6ffSpHWzNACW52fL%2FWHSFXJu8c%2Bo1U%2F%2BrRYndgtPOGCfVWzuHsfWWIUe8puMbZOReK%2F68GEl8%0AYjcj0xRDKbRYj1ye126ztA5aiLptdYXIQJyoZullISo6nb8RqtMS%2BGyuLEq6%2BaDmXQwBDoQxfPXh%0A218kB0IAYzM%3D|预订|270000K90324|K903|TYV|XKS|TYV|CZF|11:11|16:52|05:41|Y|rdMgG%2FzKIznFSrlmSzK7YSTrgjX16fo5SwYi%2FVsQtcsWlduE8mKv8ADsQYg%3D|20210205|3|V1|01|08|1|0||||2|||无||14|有|||||304010W0|3411|1|0||3008750014401325000210041500211004153000|0|||||1|#0#0|","|列车运行图调整,暂停发售|270000G69500|G695|TNV|CWQ|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","xvdTpvA0loIho5J8QZuF6G1lkDTaPQBjS3sqnsVxiV7vYZb01KmAyn5sHdihW%2BwPB7f7BTumKOHJ%0AkEOSg1lrNKrgdqiy4GxIAx%2Fyi7vrQ8qBSEOuFes%2BjqQ8552uLZJZD223FKCJD3otn2%2F8CdmyPkfw%0AvI%2FgpGW96hdfyarYiKg4hqfPCY8A8wCI0I364zYzk%2Bpm3%2BLqKay5rZZpgj7%2BBqSi%2B8ewCPON3Byc%0AZ237l3RhqewfFDYRLadNR8jhAAjz5nUi3TAsmqv58JJmUCQfln2tz%2FL2Fa9TtWHBqRpyyw%2FZnwTq%0Af%2FPgy0qRaHbpDbL6|预订|28000K136514|K1365|DTV|WCN|TYV|CBF|12:01|16:48|04:47|Y|ZGgFho8UEBZwQUfGRPu87yZfiAFOk8qnBMnkgomoexC7iwkXAspLT6rFY0U%3D|20210205|3|V2|06|10|1|0||||无|||无||无|1|||||304010W0|3411|1|1||3008750000401325000010041500011004153000|0|||||1|0#0#0|","EpNY4KIneIVEE7B8tUlVJpnVVoeY3HiKF%2BAaAFFOVTzECVIXshyNQuEcehjcTbBgUbZH1qWA6EzZ%0A2M7PF8pGD%2BOO%2F4yNpz54xeoNfXBIbuYiGr0lDwz3UhesYiRoKJPRUlukbsaAo9Bjqb475ps6X5oa%0AlaATPHa8rxV03DoJrp5o4IKL9ergXkpNw0hrY9qPDXKY6x1%2Bk7OvsbDU0yP0v9f6eERKtfih%2B8ZC%0AUq4eBs40mqcXK%2BPdI%2Fr%2Fe7YM%2BMujR26Xe7nbyqxiYh0Y4YfjYESViJn%2FR0yAM5QUe6l3prxPZQcs%0Azrx4Rny30u5ltp2s|预订|28000K136514|K1365|DTV|WCN|TYV|CZF|12:01|17:20|05:19|Y|ZGgFho8UEBZwQUfGRPu87yZfiAFOk8qnBMnkgomoexC7iwkXAspLT6rFY0U%3D|20210205|3|V2|06|11|1|0||||无|||无||无|1|||||304010W0|3411|1|1||3008750000401325000010041500011004153000|0|||||1|0#0#0|","9SL7NoF5i1BW7FwnqsiFhidRKRW8roaW0X36falV1qcSqe3sXxaACOvdggu7tkWDT%2F4RrwcjVShR%0ANNFKuIe2UzKahM0nYokINYElADly%2FTZ%2BoS1SZKM0PAguCFRX04pMnZGomS%2FDC64y5LSp7gqpDPzH%0AbpS8czwyMjcwv2KdedV%2BmZOe%2Ftda1YSaKBbKKF%2FA5k0UqwlDytF1FwYBy5Phf7RYnsgIG89QZ1%2FE%0AXGLuwOBa5ypn2vKtQwdwkj%2Fhhs%2B8WFZ1BMSCDgk4Udk%2FcVDMfOy%2BTK1WfucdAYIMKP7suBbYZ%2FgW%0AH5jotdbvpO4%2Bd0pr|预订|27000015511R|1551|TYV|UKH|TYV|CBF|12:27|17:31|05:04|Y|FcvwVSZyrvlrzuU9D1Yf1NlNxf70uawK5JgLF1ErT4a%2Ff%2Fq4CArGKA8L%2BEo%3D|20210205|3|V2|01|05|1|0||||无|||无||无|有|||||403010W0|4311|0|1||4012750000300825000010036500211003653000|0|||||1|0#0#0|","d4YeVWiuR73o%2BoAmF5mytxrbRDDF8S7ci25STvf5pwJKkbwAuplqOf7dGhh0Y%2BiywoNdBd%2FQPkqA%0AaCAIdiGCR39xdBpzJUOxqKMVQ6GJKsh1DgzrJFdOViT4XCLtgGH4PVjzkGs0c4dU89J0Wo054pR1%0AQKuH0JYQ9dpRonUHXT0lFDLYBYkm%2BSX9SCP6jbroGETzfyQd3k7YTg6Uh2O7Fl7NHz2lQ%2FVqRLL%2B%0Ap%2FFbEoDqI80t%2F19Rz5qMgVL5udolrdjAMVbsUU6MTMeocv1i473sBf6ejMYlfDfNqqpeA80kUCaF%0ACHh6izD3en0%3D|预订|27000015511R|1551|TYV|UKH|TYV|CZF|12:27|18:03|05:36|Y|FcvwVSZyrvlrzuU9D1Yf1NlNxf70uawK5JgLF1ErT4a%2Ff%2Fq4CArGKA8L%2BEo%3D|20210205|3|V2|01|06|1|0||||无|||无||无|有|||||403010W0|4311|0|1||4012750000300825000010036500211003653000|0|||||1|0#0#0|","|列车运行图调整,暂停发售|27000D335300|D3353|TNV|ZZF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D337900|D3379|TNV|CUF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|03|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","JTaayPb%2BrlyvYbeC%2BhmZ2NOJp3UBVdHVT3YLKIZVRIM3LeziY7muuW4VuR26PXAW%2Fqx8ZYaB%2B2Dw%0Auxa78Pcj4xY9bb%2B2swE9oZ6UVWI7dHaoWBFNI2LXA9q%2B7rT8Ktn%2Ffn1FGmcO9ENDkwQep%2FjzuRwL%0Ae8AB9I627u7G%2Bn5%2BgQ7iwP6aqLRoh7wpEVo7FUxKvFz%2Bbcuy0uu1BAZOXYqqeajqTxXihyLzzTLa%0AyAJvZ%2FftRuxH7n8sdLwf6W%2FWVSpIfesYPycEqKQ4AmxjrWCQCoIo0hfd4f1BDUm4IRBHFCNxCMTq%0AiELvMw%3D%3D|预订|240000G68310|G683|BXP|JGF|TNV|CUF|15:46|16:58|01:12|N|t%2FEv39LWYRxABg%2BTpbwSubqRitUhWxBidp8JRGsiySz0Ozrq|20210205|3|P3|06|08|1|0|||||||||||无|无|无||O0M090|OM9|0|1|O|O009500000M0150000009032900000|0|||||1|#0#0|","|列车运行图调整,暂停发售|27000D338100|D3381|TNV|JOF|TNV|CAF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|03|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|280000D31500|D315|DMV|SHH|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|03|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D338500|D3385|TNV|JGF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|06|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","5YVntpSlthvMrNnMpnLDrFCGViBoevNuSIeflF2%2FUegdflC2LnTIx8NA1vGgK7ArYG%2FiUcSOGt49%0Av3Lo8bfMZZALx1p81WaPpwdQeeiEy68M7LVvwtimzwLbXBKNEWmp0FQunY9JlZV7UEVgYT%2FCT0Ms%0AvmgUyTgdj2Sj79dEqPo6gZcpFHFbBtdMnJjcVBvYzH5mxKFuqW9z2HdPOyw2YSNuMOg8Lol3GSoO%0AmkZk%2BFzwOEEpK7v%2FMSisAXJSd7ohLXY2zC122O1MGoL7EykZd%2FQWDpa5WIelv%2Be3l5DIr1BuLj7B%0AcVls3w%3D%3D|预订|240000G68100|G681|BXP|CUF|TNV|CUF|19:50|21:33|01:43|N|VMaLj0qIcy7OeQNaplIRTmKbNLpE3XbZQhTBnLHKoPUJdjcu|20210205|3|P2|04|10|1|0|||||||||||无|无|无||M0O090|MO9|0|1||M015000000O0095000009032900000|0|||||1|#0#0|"],"flag":"1","map":{"TYV":"太原","CUF":"长治东","CBF":"长治北","CAF":"长治南","TNV":"太原南","CZF":"长治"}}
     * messages :
     * status : true
     */

    private int httpstatus;
    private DataDTO data;
    private String messages;
    private boolean status;

    public int getHttpstatus() {
        return httpstatus;
    }

    public void setHttpstatus(int httpstatus) {
        this.httpstatus = httpstatus;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static class DataDTO {
        /**
         * result : ["|列车运行图调整,暂停发售|27000D336100|D3361|TNV|JGF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D336110|D3361|TNV|JGF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D336300|D3363|TNV|JOF|TNV|CAF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D334700|D3347|TNV|ZZF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D334700|D3347|TNV|ZZF|TNV|CAF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D336500|D3365|TNV|CUF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D337100|D3371|TNV|JOF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000G313500|G3135|TNV|NGH|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","2xogFJotbFGmnQZYRdqAIGCZX7ikznvgxnfeUGys3rn6iMs%2FYDx888oIkdKjhJIpF448LQ7iDY7w%0AvUdDfVQSdT6D92qB%2B3p4J1OqcWllYcd%2BzBpFkorXIIFwtvvVSpOiebyPyXI8UgsNdFrSEJ2DJMXs%0Avof%2BbNKFf96ng9GS6rd03SpBT1pHD6F7fNMkS0n3zpUVSHp05ZADItIRO91KF6W%2FURgzPATy6KbN%0A0%2Fyd5hZcvq9U0O6BfQVYSCqHTZKXPOdfDddo6Tq4gJRUbxHfc60hD8s7A%2FzZpCNxgROBfgnVx8q8%0Ak8V5Pw62Immvj2OG|预订|270000K90324|K903|TYV|XKS|TYV|CBF|11:11|16:20|05:09|Y|rdMgG%2FzKIznFSrlmSzK7YSTrgjX16fo5SwYi%2FVsQtcsWlduE8mKv8ADsQYg%3D|20210205|3|V1|01|07|1|0||||2|||无||14|有|||||304010W0|3411|1|0||3008750014401325000210041500211004153000|0|||||1|#0#0|","Y2BCbbY9py0Cv4SDYh6OxktpD93LzkBYWKGY3uMzvbz6CVwNh9y5W7kLekzel5tzR9PFf1S3oOnt%0A5Z12OsUH%2FIvb9U6613RIoiHRa04BNgMtG3CZ4MXdtwARNHi%2Fjx5eSv8%2FBuNJnqtFsciF4B5JiReN%0AKZb6ffSpHWzNACW52fL%2FWHSFXJu8c%2Bo1U%2F%2BrRYndgtPOGCfVWzuHsfWWIUe8puMbZOReK%2F68GEl8%0AYjcj0xRDKbRYj1ye126ztA5aiLptdYXIQJyoZullISo6nb8RqtMS%2BGyuLEq6%2BaDmXQwBDoQxfPXh%0A218kB0IAYzM%3D|预订|270000K90324|K903|TYV|XKS|TYV|CZF|11:11|16:52|05:41|Y|rdMgG%2FzKIznFSrlmSzK7YSTrgjX16fo5SwYi%2FVsQtcsWlduE8mKv8ADsQYg%3D|20210205|3|V1|01|08|1|0||||2|||无||14|有|||||304010W0|3411|1|0||3008750014401325000210041500211004153000|0|||||1|#0#0|","|列车运行图调整,暂停发售|270000G69500|G695|TNV|CWQ|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","xvdTpvA0loIho5J8QZuF6G1lkDTaPQBjS3sqnsVxiV7vYZb01KmAyn5sHdihW%2BwPB7f7BTumKOHJ%0AkEOSg1lrNKrgdqiy4GxIAx%2Fyi7vrQ8qBSEOuFes%2BjqQ8552uLZJZD223FKCJD3otn2%2F8CdmyPkfw%0AvI%2FgpGW96hdfyarYiKg4hqfPCY8A8wCI0I364zYzk%2Bpm3%2BLqKay5rZZpgj7%2BBqSi%2B8ewCPON3Byc%0AZ237l3RhqewfFDYRLadNR8jhAAjz5nUi3TAsmqv58JJmUCQfln2tz%2FL2Fa9TtWHBqRpyyw%2FZnwTq%0Af%2FPgy0qRaHbpDbL6|预订|28000K136514|K1365|DTV|WCN|TYV|CBF|12:01|16:48|04:47|Y|ZGgFho8UEBZwQUfGRPu87yZfiAFOk8qnBMnkgomoexC7iwkXAspLT6rFY0U%3D|20210205|3|V2|06|10|1|0||||无|||无||无|1|||||304010W0|3411|1|1||3008750000401325000010041500011004153000|0|||||1|0#0#0|","EpNY4KIneIVEE7B8tUlVJpnVVoeY3HiKF%2BAaAFFOVTzECVIXshyNQuEcehjcTbBgUbZH1qWA6EzZ%0A2M7PF8pGD%2BOO%2F4yNpz54xeoNfXBIbuYiGr0lDwz3UhesYiRoKJPRUlukbsaAo9Bjqb475ps6X5oa%0AlaATPHa8rxV03DoJrp5o4IKL9ergXkpNw0hrY9qPDXKY6x1%2Bk7OvsbDU0yP0v9f6eERKtfih%2B8ZC%0AUq4eBs40mqcXK%2BPdI%2Fr%2Fe7YM%2BMujR26Xe7nbyqxiYh0Y4YfjYESViJn%2FR0yAM5QUe6l3prxPZQcs%0Azrx4Rny30u5ltp2s|预订|28000K136514|K1365|DTV|WCN|TYV|CZF|12:01|17:20|05:19|Y|ZGgFho8UEBZwQUfGRPu87yZfiAFOk8qnBMnkgomoexC7iwkXAspLT6rFY0U%3D|20210205|3|V2|06|11|1|0||||无|||无||无|1|||||304010W0|3411|1|1||3008750000401325000010041500011004153000|0|||||1|0#0#0|","9SL7NoF5i1BW7FwnqsiFhidRKRW8roaW0X36falV1qcSqe3sXxaACOvdggu7tkWDT%2F4RrwcjVShR%0ANNFKuIe2UzKahM0nYokINYElADly%2FTZ%2BoS1SZKM0PAguCFRX04pMnZGomS%2FDC64y5LSp7gqpDPzH%0AbpS8czwyMjcwv2KdedV%2BmZOe%2Ftda1YSaKBbKKF%2FA5k0UqwlDytF1FwYBy5Phf7RYnsgIG89QZ1%2FE%0AXGLuwOBa5ypn2vKtQwdwkj%2Fhhs%2B8WFZ1BMSCDgk4Udk%2FcVDMfOy%2BTK1WfucdAYIMKP7suBbYZ%2FgW%0AH5jotdbvpO4%2Bd0pr|预订|27000015511R|1551|TYV|UKH|TYV|CBF|12:27|17:31|05:04|Y|FcvwVSZyrvlrzuU9D1Yf1NlNxf70uawK5JgLF1ErT4a%2Ff%2Fq4CArGKA8L%2BEo%3D|20210205|3|V2|01|05|1|0||||无|||无||无|有|||||403010W0|4311|0|1||4012750000300825000010036500211003653000|0|||||1|0#0#0|","d4YeVWiuR73o%2BoAmF5mytxrbRDDF8S7ci25STvf5pwJKkbwAuplqOf7dGhh0Y%2BiywoNdBd%2FQPkqA%0AaCAIdiGCR39xdBpzJUOxqKMVQ6GJKsh1DgzrJFdOViT4XCLtgGH4PVjzkGs0c4dU89J0Wo054pR1%0AQKuH0JYQ9dpRonUHXT0lFDLYBYkm%2BSX9SCP6jbroGETzfyQd3k7YTg6Uh2O7Fl7NHz2lQ%2FVqRLL%2B%0Ap%2FFbEoDqI80t%2F19Rz5qMgVL5udolrdjAMVbsUU6MTMeocv1i473sBf6ejMYlfDfNqqpeA80kUCaF%0ACHh6izD3en0%3D|预订|27000015511R|1551|TYV|UKH|TYV|CZF|12:27|18:03|05:36|Y|FcvwVSZyrvlrzuU9D1Yf1NlNxf70uawK5JgLF1ErT4a%2Ff%2Fq4CArGKA8L%2BEo%3D|20210205|3|V2|01|06|1|0||||无|||无||无|有|||||403010W0|4311|0|1||4012750000300825000010036500211003653000|0|||||1|0#0#0|","|列车运行图调整,暂停发售|27000D335300|D3353|TNV|ZZF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|05|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D337900|D3379|TNV|CUF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|03|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","JTaayPb%2BrlyvYbeC%2BhmZ2NOJp3UBVdHVT3YLKIZVRIM3LeziY7muuW4VuR26PXAW%2Fqx8ZYaB%2B2Dw%0Auxa78Pcj4xY9bb%2B2swE9oZ6UVWI7dHaoWBFNI2LXA9q%2B7rT8Ktn%2Ffn1FGmcO9ENDkwQep%2FjzuRwL%0Ae8AB9I627u7G%2Bn5%2BgQ7iwP6aqLRoh7wpEVo7FUxKvFz%2Bbcuy0uu1BAZOXYqqeajqTxXihyLzzTLa%0AyAJvZ%2FftRuxH7n8sdLwf6W%2FWVSpIfesYPycEqKQ4AmxjrWCQCoIo0hfd4f1BDUm4IRBHFCNxCMTq%0AiELvMw%3D%3D|预订|240000G68310|G683|BXP|JGF|TNV|CUF|15:46|16:58|01:12|N|t%2FEv39LWYRxABg%2BTpbwSubqRitUhWxBidp8JRGsiySz0Ozrq|20210205|3|P3|06|08|1|0|||||||||||无|无|无||O0M090|OM9|0|1|O|O009500000M0150000009032900000|0|||||1|#0#0|","|列车运行图调整,暂停发售|27000D338100|D3381|TNV|JOF|TNV|CAF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|03|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|280000D31500|D315|DMV|SHH|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|03|04|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","|列车运行图调整,暂停发售|27000D338500|D3385|TNV|JGF|TNV|CUF|24:00|24:00|99:59|IS_TIME_NOT_BUY||20210205||V1|01|06|0|1|||||||||||||||||0|0|null||2@列车运行图调整,暂停发售||||||0|","5YVntpSlthvMrNnMpnLDrFCGViBoevNuSIeflF2%2FUegdflC2LnTIx8NA1vGgK7ArYG%2FiUcSOGt49%0Av3Lo8bfMZZALx1p81WaPpwdQeeiEy68M7LVvwtimzwLbXBKNEWmp0FQunY9JlZV7UEVgYT%2FCT0Ms%0AvmgUyTgdj2Sj79dEqPo6gZcpFHFbBtdMnJjcVBvYzH5mxKFuqW9z2HdPOyw2YSNuMOg8Lol3GSoO%0AmkZk%2BFzwOEEpK7v%2FMSisAXJSd7ohLXY2zC122O1MGoL7EykZd%2FQWDpa5WIelv%2Be3l5DIr1BuLj7B%0AcVls3w%3D%3D|预订|240000G68100|G681|BXP|CUF|TNV|CUF|19:50|21:33|01:43|N|VMaLj0qIcy7OeQNaplIRTmKbNLpE3XbZQhTBnLHKoPUJdjcu|20210205|3|P2|04|10|1|0|||||||||||无|无|无||M0O090|MO9|0|1||M015000000O0095000009032900000|0|||||1|#0#0|"]
         * flag : 1
         * map : {"TYV":"太原","CUF":"长治东","CBF":"长治北","CAF":"长治南","TNV":"太原南","CZF":"长治"}
         */

        private String flag;
        private MapDTO map;
        private List<String> result;

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public MapDTO getMap() {
            return map;
        }

        public void setMap(MapDTO map) {
            this.map = map;
        }

        public List<String> getResult() {
            return result;
        }

        public void setResult(List<String> result) {
            this.result = result;
        }

        public static class MapDTO {
            /**
             * TYV : 太原
             * CUF : 长治东
             * CBF : 长治北
             * CAF : 长治南
             * TNV : 太原南
             * CZF : 长治
             */

            private String TYV;
            private String CUF;
            private String CBF;
            private String CAF;
            private String TNV;
            private String CZF;

            public String getTYV() {
                return TYV;
            }

            public void setTYV(String TYV) {
                this.TYV = TYV;
            }

            public String getCUF() {
                return CUF;
            }

            public void setCUF(String CUF) {
                this.CUF = CUF;
            }

            public String getCBF() {
                return CBF;
            }

            public void setCBF(String CBF) {
                this.CBF = CBF;
            }

            public String getCAF() {
                return CAF;
            }

            public void setCAF(String CAF) {
                this.CAF = CAF;
            }

            public String getTNV() {
                return TNV;
            }

            public void setTNV(String TNV) {
                this.TNV = TNV;
            }

            public String getCZF() {
                return CZF;
            }

            public void setCZF(String CZF) {
                this.CZF = CZF;
            }
        }
    }
}
