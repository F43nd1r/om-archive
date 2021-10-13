
solution {
    puzzle = "w2450512021"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = -4 to 4
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 4
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = -1
    }
    track {
        position = -4 to 4
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                extend()
                back()
                drop()
                retract()
                retract()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                retract()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                extend()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                extend()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
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
