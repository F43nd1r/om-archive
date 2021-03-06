
solution {
    puzzle = "P029"
    name = "B AA 6T"
    arm(PISTON) {
        number = 1
        position = -2 to 1
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 0
        rotation = 8
    }
    glyph(CALCIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -15 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -2
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(-1 to 1, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                back()
                extend()
                grab()
                forward()
                rotateClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                forward()
                grab()
                back()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                forward()
                grab()
                back()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                forward()
                grab()
                back()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                forward()
                grab()
                back()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                forward()
                grab()
                back()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
