package me.mbcu.crawler.honestbee

import play.api.libs.json.{JsValue, Json, OFormat}

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
object Result {


  case class Store(storeId: Int, name: String, departments: mutable.Map[Int, mutable.Map[Int, scala.collection.mutable.ListBuffer[JsValue]]] = mutable.Map.empty)

  object Prod {
    implicit val jsonFormat: OFormat[Prod] = Json.format[Prod]
  }

  case class Prod(storeId: Int, name: String, department: Int, category: Int, product:JsValue)


  object HappyFresh {
    implicit val jsonFormat: OFormat[HappyFresh] = Json.format[HappyFresh]

  }
  case class HappyFresh(products: scala.collection.mutable.ListBuffer[Prod])

//  case class Prod (
//                     id: Int,
//                     title: String,
//                     description: Option[String],
//                     imageUrl: Option[String],
//                     previewImageUrl: Option[String],
//                     slug: Option[String],
//
//                     barcode: Option[String],
//
//                     unitType: Option[String],
//                     soldBy: Option[String],
//                     amountPerUnit: Option[String],
//                     size: Option[String],
//                     status: Option[String],
//                     imageUrlBasename: Option[String],
//                     currency: Option[String],
//                     promotionStartsAt: Option[String],
//                     promotionEndsAt: Option[String],
//                     maxQuantity: Option[String],
//                     customerNotesEnabled: Option[String],
//                     price: Option[String],
//                     normalPrice: Option[String],
//                     productBrand: Option[String],
//                     productInfo: Option[String],
//                     packingSize: Option[String],
//                     descriptionHtml: Option[String],
//                     countryOfOrigin: Option[String],
//                     alcohol: Option[Boolean]
//
//                     )
/*
            "id": 5979729,
            "title": "Aroma Therapy Absolute Relax Shower Gel",
            "description": null,
            "imageUrl": "https://assets.honestbee.com/products/images/480/aeon-id_03677728_03677728-1.png",
            "previewImageUrl": "https://assets.honestbee.com/products/images/480/aeon-id_03677728_03677728-1.png",
            "slug": null,
            "barcodes": [],
            "barcode": null,
            "unitType": "unit_type_item",
            "soldBy": "sold_by_item",
            "amountPerUnit": "1.0",
            "size": "450 ml",
            "status": "status_available",
            "imageUrlBasename": "aeon-id_03677728_03677728-1.png",
            "currency": "IDR",
            "promotionStartsAt": null,
            "promotionEndsAt": "2019-02-05T00:00:00Z",
            "maxQuantity": "30.0",
            "customerNotesEnabled": true,
            "price": "40000.0",
            "normalPrice": "40000.0",
            "nutritionalInfo": {},
            "productBrand": "Palmolive",
            "productInfo": null,
            "packingSize": "450 ml",
            "descriptionHtml": null,
            "countryOfOrigin": null,
            "tags": [],
            "alcohol": false
 */

}
