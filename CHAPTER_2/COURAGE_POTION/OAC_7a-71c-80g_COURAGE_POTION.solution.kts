
solution {
    puzzle = "P021"
    name = "OA"
    arm(PISTON) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                extend()
                extend()
                grab()
                retract()
                reset()
            }
        }
        )
    }
}
