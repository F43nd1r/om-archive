
solution {
    puzzle = "P028"
    name = "B AGX"
    arm(PISTON) {
        number = 1
        position = -1 to 1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 0
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                retract()
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
