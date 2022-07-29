package com.testwithspring.master.message

import com.testwithspring.master.EndToEndTest
import org.junit.experimental.categories.Category
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import spock.lang.Specification

@Category(EndToEndTest.class)
class ShowMessageTextSpec extends Specification {



    ChromeOptions options = new ChromeOptions()
//    options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
    def browser = new ChromeDriver(options)

    def 'Open message page'() {

        given: 'Chrome Driver is set'
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",["enable-automation"])
        def browser = new ChromeDriver(options)

        when: 'A user opens the message'
        browser.get('http://localhost:8080/hi/')
//        browser.get("http://localhost:4444/wd/hub")
        then: 'Should show the correct title'
        println 'End-to-End Test: Should show the correct title'
        browser.title == 'Hello World!'
        browser.quit()

    }
    def cleanup() {
        browser.quit()
    }
}
