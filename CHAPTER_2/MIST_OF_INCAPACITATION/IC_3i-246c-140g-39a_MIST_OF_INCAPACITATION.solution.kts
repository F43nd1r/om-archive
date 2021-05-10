
solution {
    puzzle = "P018"
    name = "INSTRUCTIONS 5"
    arm(ARM6) {
        number = 1
        position = -10 to -3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -6 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -6 to -5
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -9 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -7 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -5
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -10 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -10 to -4
        rotation = -2
    }
    io(INPUT) {
        index = 2
        position = -11 to -3
        rotation = 0
    }
    track {
        position = -10 to -3
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to 1, 3 to 0, 4 to 0, 5 to -1, 5 to -2, 5 to -3, 4 to -3, 3 to -3, 2 to -2, 1 to -2, 1 to -1)
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
