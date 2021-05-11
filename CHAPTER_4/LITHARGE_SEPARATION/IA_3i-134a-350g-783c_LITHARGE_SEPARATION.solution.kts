
solution {
    puzzle = "P031b"
    name = "INSTRUCTIONS 5"
    arm(ARM6) {
        number = 1
        position = -12 to -4
        rotation = 0
        size = 1
    }
    glyph(UNBONDER) {
        position = -12 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -11 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -11 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -8 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -8 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to -5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to -6
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -6
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -13 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -11 to 2
        rotation = 0
    }
    track {
        position = -12 to -4
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to -1, 5 to -1, 6 to -1, 7 to -2, 8 to -3, 9 to -4, 10 to -4, 11 to -4, 12 to -4, 12 to -3, 11 to -3, 10 to -2, 10 to -1, 9 to 0, 8 to 0, 8 to 1, 7 to 2, 6 to 2, 6 to 1, 5 to 1, 5 to 2, 4 to 3, 3 to 4, 2 to 4, 1 to 5, 2 to 5, 2 to 6, 1 to 7, 0 to 7, 0 to 6, 0 to 5, -1 to 5, -2 to 5, -3 to 5, -4 to 5, -4 to 4, -4 to 3, -4 to 2, -3 to 1, -2 to 0, -1 to -1, 0 to -1)
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
