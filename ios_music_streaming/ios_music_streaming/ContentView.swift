//
//  ContentView.swift
//  ios_music_streaming
//
//  Created by Robin Kim on 7/1/21.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        ZStack{
            Color(ColorComponents.backgroundColor).ignoresSafeArea()
            MainPage()
            
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
