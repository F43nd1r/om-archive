
solution {
    puzzle = "P095"
    name = "INSTRUCTIONS 1"
    arm(ARM6) {
        number = 1
        position = -13 to 2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -11 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -9 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -11 to -2
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -4 to 0
        rotation = -4
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = -4
    }
    glyph(PROJECTION) {
        position = -7 to 1
        rotation = -4
    }
    glyph(PURIFICATION) {
        position = 3 to -1
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 0 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -13 to 3
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -13 to 1
        rotation = -2
    }
    track {
        position = -18 to 4
        positions = listOf(5 to -2, 4 to -1, 3 to -1, 3 to -2, 3 to -3, 4 to -4, 5 to -5, 6 to -5, 6 to -4, 7 to -4, 8 to -5, 8 to -6, 9 to -6, 9 to -5, 10 to -5, 10 to -4, 11 to -5, 12 to -5, 13 to -5, 14 to -5, 15 to -6, 16 to -6, 17 to -6, 18 to -6, 19 to -7, 20 to -7, 21 to -7, 22 to -7, 23 to -7, 23 to -6, 22 to -5, 22 to -6, 21 to -6, 20 to -6, 20 to -5, 19 to -4, 18 to -3, 19 to -3, 19 to -2, 18 to -1, 17 to 0, 16 to 0, 16 to -1, 16 to -2, 17 to -3, 17 to -4, 16 to -3, 15 to -3, 14 to -3, 13 to -2, 12 to -2, 11 to -2, 10 to -1, 9 to -1, 8 to -1, 7 to 0, 6 to 0, 5 to 0, 6 to -1, 6 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
