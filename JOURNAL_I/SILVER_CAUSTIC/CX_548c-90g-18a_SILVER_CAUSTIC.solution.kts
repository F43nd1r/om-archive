
solution {
    puzzle = "P057"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = 3 to 1
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = 5 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to 1
        rotation = -8
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -12
    }
    io(INPUT) {
        index = 0
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 2 to 2
        rotation = 0
    }
    track {
        position = 4 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                retract()
                drop()
                back()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                extend()
                grab()
                back()
                pivotClockwise()
                retract()
                extend()
                pivotCounterClockwise()
                forward()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                extend()
                grab()
                retract()
                forward()
                drop()
                back()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
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
                reset()
            }
        }
        )
    }
}
