package com.example.loadhtml;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webview=new WebView(this);
		setContentView(webview);
		String cadena=
				"<html>" +
						"<body>" +
						"<h1>proyecto de electiva</h1>"+
						"&nbsp;"+
						"<table border='1'>"+
						"<tr>"+
						"<td>celda 1</td>"+
						"<td>celda 2</td>"+
						"<td>celda 3</td>"+
						"</tr>"+
						"<tr>"+
						"<td>celda 4</td>"+
						"<td>celda 5</td>"+
						"<td>celda 6</td>"+
						"</tr>"+
						"</table>"+
			            "</body>"+
				"</html>." ; 
		String resumen="<p>   <span style='color:#ff0000;'>proyecto de electiva</span></p>  <h1 style='text-align: center;'>   <span style='color:#ffffff;'><span style='background-color:#000000;'>hola hola</span></span></h1>  <ul>   <li>    <span style='font-family:comic sans ms,cursive;'>hello</span></li>   <li>    <span style='font-family:comic sans ms,cursive;'>david</span></li>  </ul>  <table border='1' cellpadding='1' cellspacing='1' style='width: 500px;'>   <tbody>    <tr>     <td>lalalalal</td>     <td>  leon</td>    </tr>    <tr>     <td> tralala</td>     <td>   jajajaj</td>    </tr>    <tr>     <td>      a.-sd,a.-sd</td>     <td>      &nbsp;</td>    </tr>   </tbody>  </table>  <p>   &nbsp;</p>";  
		webview.loadData(resumen, "text/html", null);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
