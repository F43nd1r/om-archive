
solution {
    puzzle = "w2450512021"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = -4 to 4
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -8
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -4 to 2
        rotation = -10
    }
    track {
        position = -4 to 5
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                retract()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                extend()
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                forward()
                retract()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                back()
                extend()
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                retract()
                drop()
                rotateClockwise()
                back()
                extend()
                grab()
                extend()
                pivotClockwise()
                drop()
                forward()
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
