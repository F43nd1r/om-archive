
solution {
    puzzle = "P031b"
    name = "INSTRUCTIONS 12"
    arm(ARM6) {
        number = 1
        position = -2 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to -1, 5 to -1, 5 to -2, 4 to -2, 3 to -2, 2 to -2, 1 to -2, 0 to -1)
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
