
solution {
    puzzle = "P010"
    name = "INSTRUCTIONS 4"
    arm(ARM6) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 1
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
