//
//  HomeView.swift
//  iosApp
//
//  Created by Anuj Kumar on 04/08/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import Foundation
import SwiftUI

struct HomeView: View {
    
    var name: String = "Test"

    var body: some View {
        VStack(alignment: .center, spacing: 15.0, content: {
            Text("Successful login. Welcome, \(name)")
        })
        .padding(.all)
    }
}
