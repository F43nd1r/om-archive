
solution {
    puzzle = "w1698785633"
    name = "B I3 C"
    arm(ARM6) {
        number = 1
        position = -1 to 0
        rotation = -2
        size = 1
    }
    glyph(UNBONDER) {
        position = 4 to -6
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 8 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 10 to -2
        rotation = -4
    }
    glyph(PROJECTION) {
        position = 7 to -7
        rotation = -5
    }
    glyph(PROJECTION) {
        position = 3 to -8
        rotation = -5
    }
    glyph(PROJECTION) {
        position = -5 to 0
        rotation = -2
    }
    glyph(PROJECTION) {
        position = 11 to -4
        rotation = -4
    }
    glyph(PURIFICATION) {
        position = 9 to -4
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 2 to 1, 3 to 0, 4 to -1, 5 to -1, 6 to -1, 6 to 0, 5 to 1, 4 to 2, 5 to 2, 6 to 1, 7 to 0, 7 to -1, 8 to -2, 9 to -2, 10 to -2, 10 to -3, 11 to -4, 11 to -5, 11 to -6, 10 to -6, 9 to -6, 8 to -5, 8 to -4, 8 to -3, 7 to -2, 6 to -2, 7 to -3, 7 to -4, 7 to -5, 7 to -6, 7 to -7, 7 to -8, 6 to -7, 6 to -6, 5 to -5, 4 to -4, 3 to -4, 3 to -5, 3 to -6, 3 to -7, 2 to -6, 2 to -5, 1 to -4, 0 to -3, -1 to -3, -2 to -2, -3 to -1, -3 to 0, -2 to 0, -1 to -1, -1 to 0)
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
