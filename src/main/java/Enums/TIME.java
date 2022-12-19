package Enums;

public enum TIME {
    MINUTE ("Через минуту"),
    MORNING ("Наутро"),
    OVERNIGHT ("За ночь"),
    GRADUALLY ("постепенно"),
    EVERYDAY ("ежедневно"),
    OPPORTUNITY ("при каждом удобном случае"),
    OCCASIONALLY ("изредка"),
    HASTILY ("поспешно"),
    AGAIN ("снова"),
    LATER ("Потом");
    private final String time;
    TIME (String place) {
        this.time = place;
    }
    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return time;
    }
}

