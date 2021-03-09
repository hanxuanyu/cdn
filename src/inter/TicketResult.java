package inter;

public interface TicketResult {
    void onSuccess(String info, boolean isMore);
    void onFailed(String error);
}
