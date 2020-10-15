
solution {
    puzzle = "P011"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = 1 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
