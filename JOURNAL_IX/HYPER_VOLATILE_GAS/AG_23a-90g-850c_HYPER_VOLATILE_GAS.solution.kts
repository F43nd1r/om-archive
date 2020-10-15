
solution {
    puzzle = "P106"
    name = "B AGX"
    arm(PISTON) {
        number = 1
        position = -3 to 4
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -1 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 1
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                extend()
                retract()
                pivotClockwise()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                back()
                grab()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                forward()
                extend()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                back()
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                extend()
                pivotClockwise()
                retract()
                pivotClockwise()
                retract()
                back()
                drop()
                forward()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                extend()
                grab()
                rotateClockwise()
                extend()
                retract()
                retract()
                rotateClockwise()
                forward()
                extend()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                retract()
                pivotClockwise()
                pivotClockwise()
                retract()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                retract()
                rotateClockwise()
                forward()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                extend()
                grab()
                retract()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                extend()
                drop()
                back()
                rotateClockwise()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
