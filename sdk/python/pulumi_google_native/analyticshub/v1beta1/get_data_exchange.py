# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from ... import _utilities

__all__ = [
    'GetDataExchangeResult',
    'AwaitableGetDataExchangeResult',
    'get_data_exchange',
    'get_data_exchange_output',
]

@pulumi.output_type
class GetDataExchangeResult:
    def __init__(__self__, description=None, display_name=None, documentation=None, icon=None, listing_count=None, name=None, primary_contact=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if documentation and not isinstance(documentation, str):
            raise TypeError("Expected argument 'documentation' to be a str")
        pulumi.set(__self__, "documentation", documentation)
        if icon and not isinstance(icon, str):
            raise TypeError("Expected argument 'icon' to be a str")
        pulumi.set(__self__, "icon", icon)
        if listing_count and not isinstance(listing_count, int):
            raise TypeError("Expected argument 'listing_count' to be a int")
        pulumi.set(__self__, "listing_count", listing_count)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if primary_contact and not isinstance(primary_contact, str):
            raise TypeError("Expected argument 'primary_contact' to be a str")
        pulumi.set(__self__, "primary_contact", primary_contact)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Optional. Description of the data exchange. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). Default value is an empty string. Max length: 2000 bytes.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        Human-readable display name of the data exchange. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and must not start or end with spaces. Default value is an empty string. Max length: 63 bytes.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def documentation(self) -> str:
        """
        Optional. Documentation describing the data exchange.
        """
        return pulumi.get(self, "documentation")

    @property
    @pulumi.getter
    def icon(self) -> str:
        """
        Optional. Base64 encoded image representing the data exchange. Max Size: 3.0MiB Expected image dimensions are 512x512 pixels, however the API only performs validation on size of the encoded data. Note: For byte fields, the content of the fields are base64-encoded (which increases the size of the data by 33-36%) when using JSON on the wire.
        """
        return pulumi.get(self, "icon")

    @property
    @pulumi.getter(name="listingCount")
    def listing_count(self) -> int:
        """
        Number of listings contained in the data exchange.
        """
        return pulumi.get(self, "listing_count")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The resource name of the data exchange. e.g. `projects/myproject/locations/US/dataExchanges/123`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="primaryContact")
    def primary_contact(self) -> str:
        """
        Optional. Email or URL of the primary point of contact of the data exchange. Max Length: 1000 bytes.
        """
        return pulumi.get(self, "primary_contact")


class AwaitableGetDataExchangeResult(GetDataExchangeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDataExchangeResult(
            description=self.description,
            display_name=self.display_name,
            documentation=self.documentation,
            icon=self.icon,
            listing_count=self.listing_count,
            name=self.name,
            primary_contact=self.primary_contact)


def get_data_exchange(data_exchange_id: Optional[str] = None,
                      location: Optional[str] = None,
                      project: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDataExchangeResult:
    """
    Gets the details of a data exchange.
    """
    __args__ = dict()
    __args__['dataExchangeId'] = data_exchange_id
    __args__['location'] = location
    __args__['project'] = project
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('google-native:analyticshub/v1beta1:getDataExchange', __args__, opts=opts, typ=GetDataExchangeResult).value

    return AwaitableGetDataExchangeResult(
        description=__ret__.description,
        display_name=__ret__.display_name,
        documentation=__ret__.documentation,
        icon=__ret__.icon,
        listing_count=__ret__.listing_count,
        name=__ret__.name,
        primary_contact=__ret__.primary_contact)


@_utilities.lift_output_func(get_data_exchange)
def get_data_exchange_output(data_exchange_id: Optional[pulumi.Input[str]] = None,
                             location: Optional[pulumi.Input[str]] = None,
                             project: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDataExchangeResult]:
    """
    Gets the details of a data exchange.
    """
    ...