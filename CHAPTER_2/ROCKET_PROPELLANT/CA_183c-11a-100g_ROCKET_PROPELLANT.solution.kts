
solution {
    puzzle = "P019"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = -1 to 4
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to 3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(2)
                grab()
                retract()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
