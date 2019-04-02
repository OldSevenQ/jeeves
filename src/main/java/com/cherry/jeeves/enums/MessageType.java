package com.cherry.jeeves.enums;

public enum MessageType {
    TEXT(1,"文本消息类型"),
    IMAGE(3,"图片消息"),
    VOICE(34,"语音消息"),
    VIDEO(43,"小视频消息"),
    MICROVIDEO(62,"短视频消息"),
    EMOTICON(47,"表情消息"),
    MEDIA(49,"多媒体消息"),
    VOIPMSG(50,""),
    VOIPNOTIFY(52,""),
    VOIPINVITE(53,""),
    LOCATION(48,""),
    STATUSNOTIFY(51,""),
    SYSNOTICE(9999,""),
    POSSIBLEFRIEND_MSG(40,""),
    VERIFYMSG(37,"好友请求"),
    SHARECARD(42,""),
    SYS(10000,"系统消息"),
    RECALLED(10002,"");

    private final int code;
    private String type;

    MessageType(int code,String type) {
        this.code = code;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
}
