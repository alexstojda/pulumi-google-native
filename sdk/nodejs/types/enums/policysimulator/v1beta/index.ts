// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***


export const GoogleCloudPolicysimulatorV1betaReplayConfigLogSource = {
    /**
     * An unspecified log source. If the log source is unspecified, the Replay defaults to using `RECENT_ACCESSES`.
     */
    LogSourceUnspecified: "LOG_SOURCE_UNSPECIFIED",
    /**
     * All access logs from the last 90 days. These logs may not include logs from the most recent 7 days.
     */
    RecentAccesses: "RECENT_ACCESSES",
} as const;

/**
 * The logs to use as input for the Replay.
 */
export type GoogleCloudPolicysimulatorV1betaReplayConfigLogSource = (typeof GoogleCloudPolicysimulatorV1betaReplayConfigLogSource)[keyof typeof GoogleCloudPolicysimulatorV1betaReplayConfigLogSource];
