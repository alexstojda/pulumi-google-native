// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring.v1.inputs.GaugeViewArgs;
import com.pulumi.googlenative.monitoring.v1.inputs.SparkChartViewArgs;
import com.pulumi.googlenative.monitoring.v1.inputs.ThresholdArgs;
import com.pulumi.googlenative.monitoring.v1.inputs.TimeSeriesQueryArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A widget showing the latest value of a metric, and how this value relates to one or more thresholds.
 * 
 */
public final class ScorecardArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScorecardArgs Empty = new ScorecardArgs();

    /**
     * Will cause the scorecard to show a gauge chart.
     * 
     */
    @Import(name="gaugeView")
    private @Nullable Output<GaugeViewArgs> gaugeView;

    /**
     * @return Will cause the scorecard to show a gauge chart.
     * 
     */
    public Optional<Output<GaugeViewArgs>> gaugeView() {
        return Optional.ofNullable(this.gaugeView);
    }

    /**
     * Will cause the scorecard to show a spark chart.
     * 
     */
    @Import(name="sparkChartView")
    private @Nullable Output<SparkChartViewArgs> sparkChartView;

    /**
     * @return Will cause the scorecard to show a spark chart.
     * 
     */
    public Optional<Output<SparkChartViewArgs>> sparkChartView() {
        return Optional.ofNullable(this.sparkChartView);
    }

    /**
     * The thresholds used to determine the state of the scorecard given the time series&#39; current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: &#39;DANGER&#39;, trigger: &#39;ABOVE&#39;, }, { value: 70, category: &#39;WARNING&#39;, trigger: &#39;ABOVE&#39;, }, { value: 10, category: &#39;DANGER&#39;, trigger: &#39;BELOW&#39;, }, { value: 20, category: &#39;WARNING&#39;, trigger: &#39;BELOW&#39;, }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
     * 
     */
    @Import(name="thresholds")
    private @Nullable Output<List<ThresholdArgs>> thresholds;

    /**
     * @return The thresholds used to determine the state of the scorecard given the time series&#39; current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: &#39;DANGER&#39;, trigger: &#39;ABOVE&#39;, }, { value: 70, category: &#39;WARNING&#39;, trigger: &#39;ABOVE&#39;, }, { value: 10, category: &#39;DANGER&#39;, trigger: &#39;BELOW&#39;, }, { value: 20, category: &#39;WARNING&#39;, trigger: &#39;BELOW&#39;, }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
     * 
     */
    public Optional<Output<List<ThresholdArgs>>> thresholds() {
        return Optional.ofNullable(this.thresholds);
    }

    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    @Import(name="timeSeriesQuery", required=true)
    private Output<TimeSeriesQueryArgs> timeSeriesQuery;

    /**
     * @return Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    public Output<TimeSeriesQueryArgs> timeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    private ScorecardArgs() {}

    private ScorecardArgs(ScorecardArgs $) {
        this.gaugeView = $.gaugeView;
        this.sparkChartView = $.sparkChartView;
        this.thresholds = $.thresholds;
        this.timeSeriesQuery = $.timeSeriesQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScorecardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScorecardArgs $;

        public Builder() {
            $ = new ScorecardArgs();
        }

        public Builder(ScorecardArgs defaults) {
            $ = new ScorecardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gaugeView Will cause the scorecard to show a gauge chart.
         * 
         * @return builder
         * 
         */
        public Builder gaugeView(@Nullable Output<GaugeViewArgs> gaugeView) {
            $.gaugeView = gaugeView;
            return this;
        }

        /**
         * @param gaugeView Will cause the scorecard to show a gauge chart.
         * 
         * @return builder
         * 
         */
        public Builder gaugeView(GaugeViewArgs gaugeView) {
            return gaugeView(Output.of(gaugeView));
        }

        /**
         * @param sparkChartView Will cause the scorecard to show a spark chart.
         * 
         * @return builder
         * 
         */
        public Builder sparkChartView(@Nullable Output<SparkChartViewArgs> sparkChartView) {
            $.sparkChartView = sparkChartView;
            return this;
        }

        /**
         * @param sparkChartView Will cause the scorecard to show a spark chart.
         * 
         * @return builder
         * 
         */
        public Builder sparkChartView(SparkChartViewArgs sparkChartView) {
            return sparkChartView(Output.of(sparkChartView));
        }

        /**
         * @param thresholds The thresholds used to determine the state of the scorecard given the time series&#39; current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: &#39;DANGER&#39;, trigger: &#39;ABOVE&#39;, }, { value: 70, category: &#39;WARNING&#39;, trigger: &#39;ABOVE&#39;, }, { value: 10, category: &#39;DANGER&#39;, trigger: &#39;BELOW&#39;, }, { value: 20, category: &#39;WARNING&#39;, trigger: &#39;BELOW&#39;, }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
         * 
         * @return builder
         * 
         */
        public Builder thresholds(@Nullable Output<List<ThresholdArgs>> thresholds) {
            $.thresholds = thresholds;
            return this;
        }

        /**
         * @param thresholds The thresholds used to determine the state of the scorecard given the time series&#39; current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: &#39;DANGER&#39;, trigger: &#39;ABOVE&#39;, }, { value: 70, category: &#39;WARNING&#39;, trigger: &#39;ABOVE&#39;, }, { value: 10, category: &#39;DANGER&#39;, trigger: &#39;BELOW&#39;, }, { value: 20, category: &#39;WARNING&#39;, trigger: &#39;BELOW&#39;, }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
         * 
         * @return builder
         * 
         */
        public Builder thresholds(List<ThresholdArgs> thresholds) {
            return thresholds(Output.of(thresholds));
        }

        /**
         * @param thresholds The thresholds used to determine the state of the scorecard given the time series&#39; current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: &#39;DANGER&#39;, trigger: &#39;ABOVE&#39;, }, { value: 70, category: &#39;WARNING&#39;, trigger: &#39;ABOVE&#39;, }, { value: 10, category: &#39;DANGER&#39;, trigger: &#39;BELOW&#39;, }, { value: 20, category: &#39;WARNING&#39;, trigger: &#39;BELOW&#39;, }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
         * 
         * @return builder
         * 
         */
        public Builder thresholds(ThresholdArgs... thresholds) {
            return thresholds(List.of(thresholds));
        }

        /**
         * @param timeSeriesQuery Fields for querying time series data from the Stackdriver metrics API.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesQuery(Output<TimeSeriesQueryArgs> timeSeriesQuery) {
            $.timeSeriesQuery = timeSeriesQuery;
            return this;
        }

        /**
         * @param timeSeriesQuery Fields for querying time series data from the Stackdriver metrics API.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesQuery(TimeSeriesQueryArgs timeSeriesQuery) {
            return timeSeriesQuery(Output.of(timeSeriesQuery));
        }

        public ScorecardArgs build() {
            $.timeSeriesQuery = Objects.requireNonNull($.timeSeriesQuery, "expected parameter 'timeSeriesQuery' to be non-null");
            return $;
        }
    }

}