
solution {
    puzzle = "P090"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -3 to 0
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 2 to -1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 1 to -2
        rotation = 3
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = 7 to 0
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 9 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 11 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 8 to 0
        rotation = 1
    }
    glyph(UNIFICATION) {
        position = 10 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    conduit {
        id = 100
        position = 0 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = 8 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(18)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(10)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                extend()
                grab()
                extend()
                rotateClockwise()
                wait(8)
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(5)
                pivotCounterClockwise()
                wait(2)
                retract()
                drop()
                wait(19)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                wait(4)
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(19)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(28)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(9)
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
