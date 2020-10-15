
solution {
    puzzle = "P069"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = -2 to 0
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -7
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 0 to -2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = -4 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = -3 to -2
        rotation = -6
    }
    io(OUTPUT) {
        index = 3
        position = -3 to -3
        rotation = -6
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
                drop()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotClockwise()
                extend()
                reset()
                wait(3)
                grab()
                retract()
                drop()
                retract()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                retract()
                forward()
                pivotCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                rotateCounterClockwise()
                drop()
                retract()
                forward()
                reset()
            }
        }
        )
    }
}
