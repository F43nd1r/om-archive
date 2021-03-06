
solution {
    puzzle = "P035"
    name = "B ACX"
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
    glyph(BONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -1
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(-1 to -1, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                forward()
                extend()
                grab()
                retract()
                retract()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                extend()
                back()
                pivotCounterClockwise()
                drop()
                retract()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
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
                back()
                extend()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                back()
                reset()
            }
        }
        )
    }
}
