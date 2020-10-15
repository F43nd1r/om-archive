
solution {
    puzzle = "P008"
    name = "B AGX 1"
    arm(PISTON) {
        number = 1
        position = -6 to -3
        rotation = -9
        size = 1
    }
    glyph(BONDER) {
        position = -7 to -2
        rotation = -6
    }
    glyph(CALCIFICATION) {
        position = -8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -1
        rotation = -6
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                extend()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
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
