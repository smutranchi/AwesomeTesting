package com.awesome.testing.gui.component.components;

import com.awesome.testing.gui.component.pages.AboutPage;
import com.awesome.testing.gui.component.pages.MainPage;
import com.awesome.testing.gui.component.pages.QuickStartPage;
import org.fluentlenium.core.FluentControl;
import org.fluentlenium.core.components.ComponentInstantiator;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends FluentWebElement {

    @FindBy(css = "nav ul li:nth-of-type(1)")
    private FluentWebElement homeLink;

    @FindBy(css = "nav ul li:nth-of-type(2)")
    private FluentWebElement quickstartLink;

    @FindBy(css = "nav ul li:nth-of-type(5)")
    private FluentWebElement aboutLink;

    public Header(WebElement element, FluentControl control, ComponentInstantiator instantiator) {
        super(element, control, instantiator);
    }

    public MainPage clickHomeLink() {
        homeLink.click();
        return newInstance(MainPage.class);
    }

    public QuickStartPage clickQuickstartLink() {
        quickstartLink.click();
        return newInstance(QuickStartPage.class);
    }

    public AboutPage clickAboutLink() {
        aboutLink.click();
        return newInstance(AboutPage.class);
    }

}
