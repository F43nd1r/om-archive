
solution {
    puzzle = "P056"
    name = "OAG"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
