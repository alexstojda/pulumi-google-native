# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from ... import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['OrganizationInstanceCanaryevaluation']


class OrganizationInstanceCanaryevaluation(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 canaryevaluations_id: Optional[pulumi.Input[str]] = None,
                 control: Optional[pulumi.Input[str]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 instances_id: Optional[pulumi.Input[str]] = None,
                 metric_labels: Optional[pulumi.Input[pulumi.InputType['GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs']]] = None,
                 organizations_id: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None,
                 treatment: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Creates a new canary evaluation for an organization.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] control: Required. The stable version that is serving requests.
        :param pulumi.Input[str] end_time: Required. End time for the evaluation's analysis.
        :param pulumi.Input[pulumi.InputType['GoogleCloudApigeeV1CanaryEvaluationMetricLabelsArgs']] metric_labels: Required. Labels used to filter the metrics used for a canary evaluation.
        :param pulumi.Input[str] start_time: Required. Start time for the canary evaluation's analysis.
        :param pulumi.Input[str] treatment: Required. The newer version that is serving requests.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if canaryevaluations_id is None and not opts.urn:
                raise TypeError("Missing required property 'canaryevaluations_id'")
            __props__['canaryevaluations_id'] = canaryevaluations_id
            __props__['control'] = control
            __props__['end_time'] = end_time
            if instances_id is None and not opts.urn:
                raise TypeError("Missing required property 'instances_id'")
            __props__['instances_id'] = instances_id
            __props__['metric_labels'] = metric_labels
            if organizations_id is None and not opts.urn:
                raise TypeError("Missing required property 'organizations_id'")
            __props__['organizations_id'] = organizations_id
            __props__['start_time'] = start_time
            __props__['treatment'] = treatment
            __props__['create_time'] = None
            __props__['name'] = None
            __props__['state'] = None
            __props__['verdict'] = None
        super(OrganizationInstanceCanaryevaluation, __self__).__init__(
            'gcp-native:apigee/v1:OrganizationInstanceCanaryevaluation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'OrganizationInstanceCanaryevaluation':
        """
        Get an existing OrganizationInstanceCanaryevaluation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["control"] = None
        __props__["create_time"] = None
        __props__["end_time"] = None
        __props__["metric_labels"] = None
        __props__["name"] = None
        __props__["start_time"] = None
        __props__["state"] = None
        __props__["treatment"] = None
        __props__["verdict"] = None
        return OrganizationInstanceCanaryevaluation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def control(self) -> pulumi.Output[str]:
        """
        Required. The stable version that is serving requests.
        """
        return pulumi.get(self, "control")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Create time of the canary evaluation.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> pulumi.Output[str]:
        """
        Required. End time for the evaluation's analysis.
        """
        return pulumi.get(self, "end_time")

    @property
    @pulumi.getter(name="metricLabels")
    def metric_labels(self) -> pulumi.Output['outputs.GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse']:
        """
        Required. Labels used to filter the metrics used for a canary evaluation.
        """
        return pulumi.get(self, "metric_labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the canary evalution.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[str]:
        """
        Required. Start time for the canary evaluation's analysis.
        """
        return pulumi.get(self, "start_time")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The current state of the canary evaluation.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def treatment(self) -> pulumi.Output[str]:
        """
        Required. The newer version that is serving requests.
        """
        return pulumi.get(self, "treatment")

    @property
    @pulumi.getter
    def verdict(self) -> pulumi.Output[str]:
        """
        The resulting verdict of the canary evaluations: NONE, PASS, or FAIL.
        """
        return pulumi.get(self, "verdict")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
