
solution {
    puzzle = "P011"
    name = "INSTRUCTIONS 11"
    arm(ARM6) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 3
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(1 to -2, 0 to -2, -1 to -1, -1 to 0, 0 to 0, 1 to 0, 1 to 1, 2 to 0, 2 to -1, 2 to -2)
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
