
solution {
    puzzle = "P022"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = -4 to 3
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -5 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -5 to 1
        rotation = 0
    }
    track {
        position = -5 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                retract()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
