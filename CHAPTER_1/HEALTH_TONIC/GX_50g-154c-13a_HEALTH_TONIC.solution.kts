
solution {
    puzzle = "P014"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = 1 to -3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 2 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
