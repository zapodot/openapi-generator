/**
 * Email api
 * Email api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package org.openapitools.server.models

import javax.validation.constraints.*
import javax.validation.Valid
import com.fasterxml.jackson.annotation.JsonProperty
/**
 * 
 *
 * @param to The email address of the recipient
 * @param subject The subject of the email
 * @param body The body of the email
 * @param cc The email address of the cc
 */


data class EmailDefinition (

    /* The email address of the recipient */

    @JsonProperty("to")
    @field:Valid
    @field:NotNull
    @field:Email
    val to: kotlin.String,

    /* The subject of the email */

    @JsonProperty("subject")
    @field:Valid
    @field:NotNull

 @field:Size(min=1,max=256)    val subject: kotlin.String,

    /* The body of the email */

    @JsonProperty("body")
    @field:Valid
    @field:NotNull

    val body: kotlin.String,

    /* The email address of the cc */

    @JsonProperty("cc")
    @field:Valid
    @field:Email
    val cc: kotlin.String? = null

)

