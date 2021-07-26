
solution {
    puzzle = "w2501727721"
    name = "B AGX"
    arm(PISTON) {
        number = 1
        position = -2 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to 1
        rotation = -3
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                back()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                extend()
                drop()
                back()
                grab()
                retract()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                retract()
                retract()
                drop()
                reset()
                grab()
                retract()
                back()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                drop()
                forward()
                extend()
                extend()
                grab()
                pivotClockwise()
                retract()
                drop()
                retract()
                back()
                grab()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
