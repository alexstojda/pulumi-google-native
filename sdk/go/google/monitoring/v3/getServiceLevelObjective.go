// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v3

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get a ServiceLevelObjective by name.
func LookupServiceLevelObjective(ctx *pulumi.Context, args *LookupServiceLevelObjectiveArgs, opts ...pulumi.InvokeOption) (*LookupServiceLevelObjectiveResult, error) {
	var rv LookupServiceLevelObjectiveResult
	err := ctx.Invoke("google-native:monitoring/v3:getServiceLevelObjective", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupServiceLevelObjectiveArgs struct {
	ServiceId               string  `pulumi:"serviceId"`
	ServiceLevelObjectiveId string  `pulumi:"serviceLevelObjectiveId"`
	V3Id                    string  `pulumi:"v3Id"`
	V3Id1                   string  `pulumi:"v3Id1"`
	View                    *string `pulumi:"view"`
}

type LookupServiceLevelObjectiveResult struct {
	// A calendar period, semantically "since the start of the current ". At this time, only DAY, WEEK, FORTNIGHT, and MONTH are supported.
	CalendarPeriod string `pulumi:"calendarPeriod"`
	// Name used for UI elements listing this SLO.
	DisplayName string `pulumi:"displayName"`
	// The fraction of service that must be good in order for this objective to be met. 0 < goal <= 0.999.
	Goal float64 `pulumi:"goal"`
	// Resource name for this ServiceLevelObjective. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
	Name string `pulumi:"name"`
	// A rolling time period, semantically "in the past ". Must be an integer multiple of 1 day no larger than 30 days.
	RollingPeriod string `pulumi:"rollingPeriod"`
	// The definition of good service, used to measure and calculate the quality of the Service's performance with respect to a single aspect of service quality.
	ServiceLevelIndicator ServiceLevelIndicatorResponse `pulumi:"serviceLevelIndicator"`
}