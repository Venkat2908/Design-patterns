package Assignments.Prototype.Assignment1;

public class Configuration implements Cloneable {
    private String themeColor;
    private Boolean autoSave;
    private String language;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;

    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public void setAutoSave(Boolean autoSave) {
        this.autoSave = autoSave;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDarkMode(Boolean darkMode) {
        this.darkMode = darkMode;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setType(ConfigurationType type) {
        this.type = type;
    }

    public Configuration() {

    }

    @Override
    public String toString() {
        return "Configuration{" +
                "themeColor='" + themeColor + '\'' +
                ", autoSave=" + autoSave +
                ", language='" + language + '\'' +
                ", darkMode=" + darkMode +
                ", fontSize=" + fontSize +
                ", fontFamily='" + fontFamily + '\'' +
                ", type=" + type +
                '}';
    }

    public Configuration clone() throws  CloneNotSupportedException{
        return  (Configuration) super.clone();
    }


}
