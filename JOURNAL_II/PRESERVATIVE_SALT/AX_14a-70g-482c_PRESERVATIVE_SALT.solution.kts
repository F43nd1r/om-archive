
solution {
    puzzle = "P060"
    name = "B AGX"
    arm(PISTON) {
        number = 1
        position = 2 to -1
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -10
    }
    glyph(CALCIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -12
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 4 to -2
        positions = listOf(-1 to 0, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
