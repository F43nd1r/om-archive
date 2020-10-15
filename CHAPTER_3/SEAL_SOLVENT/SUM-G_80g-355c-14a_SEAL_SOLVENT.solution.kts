
solution {
    puzzle = "P026"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = 2 to -1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 4 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                retract()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                reset()
            }
        }
        )
    }
}
