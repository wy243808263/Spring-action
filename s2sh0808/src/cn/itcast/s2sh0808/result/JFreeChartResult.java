package cn.itcast.s2sh0808.result;

import java.awt.Color;
import java.awt.GradientPaint;
import java.io.File;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.ui.TextAnchor;
import org.jfree.ui.action.ActionConcentrator;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;

public class JFreeChartResult extends StrutsResultSupport{

	@Override
	protected void doExecute(String finalLocation, ActionInvocation invocation)
			throws Exception {
		// TODO Auto-generated method stub
		String result = conditionalParse(this.getLocation(), invocation);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String url = ServletActionContext.getServletContext().getRealPath("a.png");
		JFreeChart localJFreeChart = createChart(createDataset());
		File file = new File(url);    
		ChartUtilities.saveChartAsPNG(file, localJFreeChart, 200, 300);
		ActionContext.getContext().put("imageURL", url);
		HttpServletRequest request = ServletActionContext.getRequest();
        RequestDispatcher dispatcher = request.getRequestDispatcher(result);
        dispatcher.forward(request, response);
	}
	
	
	
	private JFreeChart createChart(CategoryDataset paramCategoryDataset) {
		JFreeChart localJFreeChart = ChartFactory.createLineChart(
				"Statistical Bar Chart Demo 1", "Type", "Value",
				paramCategoryDataset, PlotOrientation.VERTICAL, true, true,
				false);
		CategoryPlot localCategoryPlot = (CategoryPlot) localJFreeChart
				.getPlot();
		NumberAxis localNumberAxis = (NumberAxis) localCategoryPlot
				.getRangeAxis();
		localNumberAxis.setStandardTickUnits(NumberAxis
				.createIntegerTickUnits());
		localNumberAxis.setAutoRangeIncludesZero(false);
		StatisticalBarRenderer localStatisticalBarRenderer = new StatisticalBarRenderer();
		localStatisticalBarRenderer.setDrawBarOutline(false);
		localStatisticalBarRenderer.setErrorIndicatorPaint(Color.black);
		localStatisticalBarRenderer.setIncludeBaseInRange(false);
		localCategoryPlot.setRenderer(localStatisticalBarRenderer);
		ChartUtilities.applyCurrentTheme(localJFreeChart);
		localStatisticalBarRenderer
				.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		localStatisticalBarRenderer.setBaseItemLabelsVisible(true);
		localStatisticalBarRenderer.setBaseItemLabelPaint(Color.yellow);
		localStatisticalBarRenderer
				.setBasePositiveItemLabelPosition(new ItemLabelPosition(
						ItemLabelAnchor.INSIDE6, TextAnchor.BOTTOM_CENTER));
		GradientPaint localGradientPaint1 = new GradientPaint(0.0F, 0.0F,
				Color.blue, 0.0F, 0.0F, new Color(0, 0, 64));
		GradientPaint localGradientPaint2 = new GradientPaint(0.0F, 0.0F,
				Color.green, 0.0F, 0.0F, new Color(0, 64, 0));
		localStatisticalBarRenderer.setSeriesPaint(0, localGradientPaint1);
		localStatisticalBarRenderer.setSeriesPaint(1, localGradientPaint2);
		return localJFreeChart;
	}

	private CategoryDataset createDataset() {
		DefaultStatisticalCategoryDataset localDefaultStatisticalCategoryDataset = new DefaultStatisticalCategoryDataset();
		localDefaultStatisticalCategoryDataset.add(10.0D, 2.4D, "Row 1",
				"Column 1");
		localDefaultStatisticalCategoryDataset.add(15.0D, 4.4D, "Row 1",
				"Column 2");
		localDefaultStatisticalCategoryDataset.add(13.0D, 2.1D, "Row 1",
				"Column 3");
		localDefaultStatisticalCategoryDataset.add(7.0D, 1.3D, "Row 1",
				"Column 4");
		localDefaultStatisticalCategoryDataset.add(22.0D, 2.4D, "Row 2",
				"Column 1");
		localDefaultStatisticalCategoryDataset.add(18.0D, 4.4D, "Row 2",
				"Column 2");
		localDefaultStatisticalCategoryDataset.add(28.0D, 2.1D, "Row 2",
				"Column 3");
		localDefaultStatisticalCategoryDataset.add(17.0D, 1.3D, "Row 2",
				"Column 4");
		return localDefaultStatisticalCategoryDataset;
	}

}
