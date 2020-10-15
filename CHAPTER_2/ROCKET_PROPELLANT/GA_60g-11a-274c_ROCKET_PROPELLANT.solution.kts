
solution {
    puzzle = "P019"
    name = "B AGX"
    arm(PISTON) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                extend()
                reset()
            }
        }
        )
    }
}
