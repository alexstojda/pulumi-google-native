# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from ... import _utilities, _tables
from . import outputs

__all__ = [
    'AuthenticationResponse',
    'CustomAccountResponse',
    'GoogleAccountResponse',
    'IapCredentialResponse',
    'IapTestServiceAccountInfoResponse',
    'ScanConfigErrorResponse',
    'ScanRunErrorTraceResponse',
    'ScanRunResponse',
    'ScanRunWarningTraceResponse',
    'ScheduleResponse',
]

@pulumi.output_type
class AuthenticationResponse(dict):
    """
    Scan authentication configuration.
    """
    def __init__(__self__, *,
                 custom_account: 'outputs.CustomAccountResponse',
                 google_account: 'outputs.GoogleAccountResponse',
                 iap_credential: 'outputs.IapCredentialResponse'):
        """
        Scan authentication configuration.
        :param 'CustomAccountResponseArgs' custom_account: Authentication using a custom account.
        :param 'GoogleAccountResponseArgs' google_account: Authentication using a Google account.
        :param 'IapCredentialResponseArgs' iap_credential: Authentication using Identity-Aware-Proxy (IAP).
        """
        pulumi.set(__self__, "custom_account", custom_account)
        pulumi.set(__self__, "google_account", google_account)
        pulumi.set(__self__, "iap_credential", iap_credential)

    @property
    @pulumi.getter(name="customAccount")
    def custom_account(self) -> 'outputs.CustomAccountResponse':
        """
        Authentication using a custom account.
        """
        return pulumi.get(self, "custom_account")

    @property
    @pulumi.getter(name="googleAccount")
    def google_account(self) -> 'outputs.GoogleAccountResponse':
        """
        Authentication using a Google account.
        """
        return pulumi.get(self, "google_account")

    @property
    @pulumi.getter(name="iapCredential")
    def iap_credential(self) -> 'outputs.IapCredentialResponse':
        """
        Authentication using Identity-Aware-Proxy (IAP).
        """
        return pulumi.get(self, "iap_credential")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class CustomAccountResponse(dict):
    """
    Describes authentication configuration that uses a custom account.
    """
    def __init__(__self__, *,
                 login_url: str,
                 password: str,
                 username: str):
        """
        Describes authentication configuration that uses a custom account.
        :param str login_url: Required. The login form URL of the website.
        :param str password: Required. Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
        :param str username: Required. The user name of the custom account.
        """
        pulumi.set(__self__, "login_url", login_url)
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="loginUrl")
    def login_url(self) -> str:
        """
        Required. The login form URL of the website.
        """
        return pulumi.get(self, "login_url")

    @property
    @pulumi.getter
    def password(self) -> str:
        """
        Required. Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        Required. The user name of the custom account.
        """
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class GoogleAccountResponse(dict):
    """
    Describes authentication configuration that uses a Google account.
    """
    def __init__(__self__, *,
                 password: str,
                 username: str):
        """
        Describes authentication configuration that uses a Google account.
        :param str password: Required. Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
        :param str username: Required. The user name of the Google account.
        """
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def password(self) -> str:
        """
        Required. Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        Required. The user name of the Google account.
        """
        return pulumi.get(self, "username")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class IapCredentialResponse(dict):
    """
    Describes authentication configuration for Identity-Aware-Proxy (IAP).
    """
    def __init__(__self__, *,
                 iap_test_service_account_info: 'outputs.IapTestServiceAccountInfoResponse'):
        """
        Describes authentication configuration for Identity-Aware-Proxy (IAP).
        :param 'IapTestServiceAccountInfoResponseArgs' iap_test_service_account_info: Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
        """
        pulumi.set(__self__, "iap_test_service_account_info", iap_test_service_account_info)

    @property
    @pulumi.getter(name="iapTestServiceAccountInfo")
    def iap_test_service_account_info(self) -> 'outputs.IapTestServiceAccountInfoResponse':
        """
        Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
        """
        return pulumi.get(self, "iap_test_service_account_info")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class IapTestServiceAccountInfoResponse(dict):
    """
    Describes authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
    """
    def __init__(__self__, *,
                 target_audience_client_id: str):
        """
        Describes authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
        :param str target_audience_client_id: Required. Describes OAuth2 Client ID of resources protected by Identity-Aware-Proxy(IAP).
        """
        pulumi.set(__self__, "target_audience_client_id", target_audience_client_id)

    @property
    @pulumi.getter(name="targetAudienceClientId")
    def target_audience_client_id(self) -> str:
        """
        Required. Describes OAuth2 Client ID of resources protected by Identity-Aware-Proxy(IAP).
        """
        return pulumi.get(self, "target_audience_client_id")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ScanConfigErrorResponse(dict):
    """
    Defines a custom error message used by CreateScanConfig and UpdateScanConfig APIs when scan configuration validation fails. It is also reported as part of a ScanRunErrorTrace message if scan validation fails due to a scan configuration error.
    """
    def __init__(__self__, *,
                 code: str,
                 field_name: str):
        """
        Defines a custom error message used by CreateScanConfig and UpdateScanConfig APIs when scan configuration validation fails. It is also reported as part of a ScanRunErrorTrace message if scan validation fails due to a scan configuration error.
        :param str code: Indicates the reason code for a configuration failure.
        :param str field_name: Indicates the full name of the ScanConfig field that triggers this error, for example "scan_config.max_qps". This field is provided for troubleshooting purposes only and its actual value can change in the future.
        """
        pulumi.set(__self__, "code", code)
        pulumi.set(__self__, "field_name", field_name)

    @property
    @pulumi.getter
    def code(self) -> str:
        """
        Indicates the reason code for a configuration failure.
        """
        return pulumi.get(self, "code")

    @property
    @pulumi.getter(name="fieldName")
    def field_name(self) -> str:
        """
        Indicates the full name of the ScanConfig field that triggers this error, for example "scan_config.max_qps". This field is provided for troubleshooting purposes only and its actual value can change in the future.
        """
        return pulumi.get(self, "field_name")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ScanRunErrorTraceResponse(dict):
    """
    Output only. Defines an error trace message for a ScanRun.
    """
    def __init__(__self__, *,
                 code: str,
                 most_common_http_error_code: int,
                 scan_config_error: 'outputs.ScanConfigErrorResponse'):
        """
        Output only. Defines an error trace message for a ScanRun.
        :param str code: Indicates the error reason code.
        :param int most_common_http_error_code: If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most common HTTP error code, if such is available. For example, if this code is 404, the scan has encountered too many NOT_FOUND responses.
        :param 'ScanConfigErrorResponseArgs' scan_config_error: If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error message encountered during scan configuration validation that is performed before each scan run.
        """
        pulumi.set(__self__, "code", code)
        pulumi.set(__self__, "most_common_http_error_code", most_common_http_error_code)
        pulumi.set(__self__, "scan_config_error", scan_config_error)

    @property
    @pulumi.getter
    def code(self) -> str:
        """
        Indicates the error reason code.
        """
        return pulumi.get(self, "code")

    @property
    @pulumi.getter(name="mostCommonHttpErrorCode")
    def most_common_http_error_code(self) -> int:
        """
        If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most common HTTP error code, if such is available. For example, if this code is 404, the scan has encountered too many NOT_FOUND responses.
        """
        return pulumi.get(self, "most_common_http_error_code")

    @property
    @pulumi.getter(name="scanConfigError")
    def scan_config_error(self) -> 'outputs.ScanConfigErrorResponse':
        """
        If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error message encountered during scan configuration validation that is performed before each scan run.
        """
        return pulumi.get(self, "scan_config_error")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ScanRunResponse(dict):
    """
    A ScanRun is a output-only resource representing an actual run of the scan. Next id: 12
    """
    def __init__(__self__, *,
                 end_time: str,
                 error_trace: 'outputs.ScanRunErrorTraceResponse',
                 execution_state: str,
                 has_vulnerabilities: bool,
                 name: str,
                 progress_percent: int,
                 result_state: str,
                 start_time: str,
                 urls_crawled_count: str,
                 urls_tested_count: str,
                 warning_traces: Sequence['outputs.ScanRunWarningTraceResponse']):
        """
        A ScanRun is a output-only resource representing an actual run of the scan. Next id: 12
        :param str end_time: The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user.
        :param 'ScanRunErrorTraceResponseArgs' error_trace: If result_state is an ERROR, this field provides the primary reason for scan's termination and more details, if such are available.
        :param str execution_state: The execution state of the ScanRun.
        :param bool has_vulnerabilities: Whether the scan run has found any vulnerabilities.
        :param str name: The resource name of the ScanRun. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. The ScanRun IDs are generated by the system.
        :param int progress_percent: The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan is finished, the value is 100.
        :param str result_state: The result state of the ScanRun. This field is only available after the execution state reaches "FINISHED".
        :param str start_time: The time at which the ScanRun started.
        :param str urls_crawled_count: The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now.
        :param str urls_tested_count: The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
        :param Sequence['ScanRunWarningTraceResponseArgs'] warning_traces: A list of warnings, if such are encountered during this scan run.
        """
        pulumi.set(__self__, "end_time", end_time)
        pulumi.set(__self__, "error_trace", error_trace)
        pulumi.set(__self__, "execution_state", execution_state)
        pulumi.set(__self__, "has_vulnerabilities", has_vulnerabilities)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "progress_percent", progress_percent)
        pulumi.set(__self__, "result_state", result_state)
        pulumi.set(__self__, "start_time", start_time)
        pulumi.set(__self__, "urls_crawled_count", urls_crawled_count)
        pulumi.set(__self__, "urls_tested_count", urls_tested_count)
        pulumi.set(__self__, "warning_traces", warning_traces)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> str:
        """
        The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user.
        """
        return pulumi.get(self, "end_time")

    @property
    @pulumi.getter(name="errorTrace")
    def error_trace(self) -> 'outputs.ScanRunErrorTraceResponse':
        """
        If result_state is an ERROR, this field provides the primary reason for scan's termination and more details, if such are available.
        """
        return pulumi.get(self, "error_trace")

    @property
    @pulumi.getter(name="executionState")
    def execution_state(self) -> str:
        """
        The execution state of the ScanRun.
        """
        return pulumi.get(self, "execution_state")

    @property
    @pulumi.getter(name="hasVulnerabilities")
    def has_vulnerabilities(self) -> bool:
        """
        Whether the scan run has found any vulnerabilities.
        """
        return pulumi.get(self, "has_vulnerabilities")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The resource name of the ScanRun. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. The ScanRun IDs are generated by the system.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="progressPercent")
    def progress_percent(self) -> int:
        """
        The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan is finished, the value is 100.
        """
        return pulumi.get(self, "progress_percent")

    @property
    @pulumi.getter(name="resultState")
    def result_state(self) -> str:
        """
        The result state of the ScanRun. This field is only available after the execution state reaches "FINISHED".
        """
        return pulumi.get(self, "result_state")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> str:
        """
        The time at which the ScanRun started.
        """
        return pulumi.get(self, "start_time")

    @property
    @pulumi.getter(name="urlsCrawledCount")
    def urls_crawled_count(self) -> str:
        """
        The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now.
        """
        return pulumi.get(self, "urls_crawled_count")

    @property
    @pulumi.getter(name="urlsTestedCount")
    def urls_tested_count(self) -> str:
        """
        The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
        """
        return pulumi.get(self, "urls_tested_count")

    @property
    @pulumi.getter(name="warningTraces")
    def warning_traces(self) -> Sequence['outputs.ScanRunWarningTraceResponse']:
        """
        A list of warnings, if such are encountered during this scan run.
        """
        return pulumi.get(self, "warning_traces")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ScanRunWarningTraceResponse(dict):
    """
    Output only. Defines a warning trace message for ScanRun. Warning traces provide customers with useful information that helps make the scanning process more effective.
    """
    def __init__(__self__, *,
                 code: str):
        """
        Output only. Defines a warning trace message for ScanRun. Warning traces provide customers with useful information that helps make the scanning process more effective.
        :param str code: Indicates the warning code.
        """
        pulumi.set(__self__, "code", code)

    @property
    @pulumi.getter
    def code(self) -> str:
        """
        Indicates the warning code.
        """
        return pulumi.get(self, "code")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ScheduleResponse(dict):
    """
    Scan schedule configuration.
    """
    def __init__(__self__, *,
                 interval_duration_days: int,
                 schedule_time: str):
        """
        Scan schedule configuration.
        :param int interval_duration_days: Required. The duration of time between executions in days.
        :param str schedule_time: A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
        """
        pulumi.set(__self__, "interval_duration_days", interval_duration_days)
        pulumi.set(__self__, "schedule_time", schedule_time)

    @property
    @pulumi.getter(name="intervalDurationDays")
    def interval_duration_days(self) -> int:
        """
        Required. The duration of time between executions in days.
        """
        return pulumi.get(self, "interval_duration_days")

    @property
    @pulumi.getter(name="scheduleTime")
    def schedule_time(self) -> str:
        """
        A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
        """
        return pulumi.get(self, "schedule_time")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

