
solution {
    puzzle = "P008"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = 0 to -2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -3 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 2
        position = -2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(10)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                wait(5)
                pivotCounterClockwise()
                drop()
                extend()
                wait(4)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                rotateClockwise()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                reset()
                extendTape()
            }
        }
        )
    }
}
