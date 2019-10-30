package com.generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Takephoto {
	public static void screenshot(WebDriver driver, String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File fromimg = ts.getScreenshotAs(OutputType.FILE);
		File toimg = new File(path);
		Files.copy(fromimg, toimg);
	}

}
