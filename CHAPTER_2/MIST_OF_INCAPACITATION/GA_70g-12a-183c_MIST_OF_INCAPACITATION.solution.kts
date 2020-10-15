
solution {
    puzzle = "P018"
    name = "B AA 1"
    arm(PISTON) {
        number = 1
        position = -1 to -1
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 2
        position = -1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
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
