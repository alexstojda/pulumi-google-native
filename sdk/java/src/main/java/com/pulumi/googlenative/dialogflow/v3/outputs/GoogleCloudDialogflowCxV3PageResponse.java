// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3EventHandlerResponse;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3FormResponse;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3FulfillmentResponse;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3PageResponse {
    /**
     * @return The human-readable name of the page, unique within the flow.
     * 
     */
    private String displayName;
    /**
     * @return The fulfillment to call when the session is entering the page.
     * 
     */
    private GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment;
    /**
     * @return Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
     */
    private List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers;
    /**
     * @return The form associated with the page, used for collecting parameters relevant to the page.
     * 
     */
    private GoogleCloudDialogflowCxV3FormResponse form;
    /**
     * @return The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    private String name;
    /**
     * @return Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page&#39;s transition route -&gt; page&#39;s transition route group -&gt; flow&#39;s transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    private List<String> transitionRouteGroups;
    /**
     * @return A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
     */
    private List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes;

    private GoogleCloudDialogflowCxV3PageResponse() {}
    /**
     * @return The human-readable name of the page, unique within the flow.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The fulfillment to call when the session is entering the page.
     * 
     */
    public GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment() {
        return this.entryFulfillment;
    }
    /**
     * @return Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
     */
    public List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers() {
        return this.eventHandlers;
    }
    /**
     * @return The form associated with the page, used for collecting parameters relevant to the page.
     * 
     */
    public GoogleCloudDialogflowCxV3FormResponse form() {
        return this.form;
    }
    /**
     * @return The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page&#39;s transition route -&gt; page&#39;s transition route group -&gt; flow&#39;s transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    public List<String> transitionRouteGroups() {
        return this.transitionRouteGroups;
    }
    /**
     * @return A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
     */
    public List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes() {
        return this.transitionRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3PageResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment;
        private List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers;
        private GoogleCloudDialogflowCxV3FormResponse form;
        private String name;
        private List<String> transitionRouteGroups;
        private List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes;
        public Builder() {}
        public Builder(GoogleCloudDialogflowCxV3PageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entryFulfillment = defaults.entryFulfillment;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.form = defaults.form;
    	      this.name = defaults.name;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder entryFulfillment(GoogleCloudDialogflowCxV3FulfillmentResponse entryFulfillment) {
            this.entryFulfillment = Objects.requireNonNull(entryFulfillment);
            return this;
        }
        @CustomType.Setter
        public Builder eventHandlers(List<GoogleCloudDialogflowCxV3EventHandlerResponse> eventHandlers) {
            this.eventHandlers = Objects.requireNonNull(eventHandlers);
            return this;
        }
        public Builder eventHandlers(GoogleCloudDialogflowCxV3EventHandlerResponse... eventHandlers) {
            return eventHandlers(List.of(eventHandlers));
        }
        @CustomType.Setter
        public Builder form(GoogleCloudDialogflowCxV3FormResponse form) {
            this.form = Objects.requireNonNull(form);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder transitionRouteGroups(List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Objects.requireNonNull(transitionRouteGroups);
            return this;
        }
        public Builder transitionRouteGroups(String... transitionRouteGroups) {
            return transitionRouteGroups(List.of(transitionRouteGroups));
        }
        @CustomType.Setter
        public Builder transitionRoutes(List<GoogleCloudDialogflowCxV3TransitionRouteResponse> transitionRoutes) {
            this.transitionRoutes = Objects.requireNonNull(transitionRoutes);
            return this;
        }
        public Builder transitionRoutes(GoogleCloudDialogflowCxV3TransitionRouteResponse... transitionRoutes) {
            return transitionRoutes(List.of(transitionRoutes));
        }
        public GoogleCloudDialogflowCxV3PageResponse build() {
            final var o = new GoogleCloudDialogflowCxV3PageResponse();
            o.displayName = displayName;
            o.entryFulfillment = entryFulfillment;
            o.eventHandlers = eventHandlers;
            o.form = form;
            o.name = name;
            o.transitionRouteGroups = transitionRouteGroups;
            o.transitionRoutes = transitionRoutes;
            return o;
        }
    }
}