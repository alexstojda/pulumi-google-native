# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from ... import _utilities
from . import outputs
from ._enums import *
from ._inputs import *

__all__ = ['JobTemplateArgs', 'JobTemplate']

@pulumi.input_type
class JobTemplateArgs:
    def __init__(__self__, *,
                 job_template_id: pulumi.Input[str],
                 config: Optional[pulumi.Input['JobConfigArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a JobTemplate resource.
        :param pulumi.Input[str] job_template_id: Required. The ID to use for the job template, which will become the final component of the job template's resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
        :param pulumi.Input['JobConfigArgs'] config: The configuration for this template.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: The labels associated with this job template. You can use these to organize and group your job templates.
        :param pulumi.Input[str] name: The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
        """
        pulumi.set(__self__, "job_template_id", job_template_id)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="jobTemplateId")
    def job_template_id(self) -> pulumi.Input[str]:
        """
        Required. The ID to use for the job template, which will become the final component of the job template's resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
        """
        return pulumi.get(self, "job_template_id")

    @job_template_id.setter
    def job_template_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "job_template_id", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['JobConfigArgs']]:
        """
        The configuration for this template.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['JobConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The labels associated with this job template. You can use these to organize and group your job templates.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)


class JobTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[pulumi.InputType['JobConfigArgs']]] = None,
                 job_template_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a job template in the specified region.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['JobConfigArgs']] config: The configuration for this template.
        :param pulumi.Input[str] job_template_id: Required. The ID to use for the job template, which will become the final component of the job template's resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: The labels associated with this job template. You can use these to organize and group your job templates.
        :param pulumi.Input[str] name: The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: JobTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a job template in the specified region.

        :param str resource_name: The name of the resource.
        :param JobTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(JobTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[pulumi.InputType['JobConfigArgs']]] = None,
                 job_template_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = JobTemplateArgs.__new__(JobTemplateArgs)

            __props__.__dict__["config"] = config
            if job_template_id is None and not opts.urn:
                raise TypeError("Missing required property 'job_template_id'")
            __props__.__dict__["job_template_id"] = job_template_id
            __props__.__dict__["labels"] = labels
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
        super(JobTemplate, __self__).__init__(
            'google-native:transcoder/v1:JobTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'JobTemplate':
        """
        Get an existing JobTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = JobTemplateArgs.__new__(JobTemplateArgs)

        __props__.__dict__["config"] = None
        __props__.__dict__["labels"] = None
        __props__.__dict__["name"] = None
        return JobTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output['outputs.JobConfigResponse']:
        """
        The configuration for this template.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        The labels associated with this job template. You can use these to organize and group your job templates.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
        """
        return pulumi.get(self, "name")
