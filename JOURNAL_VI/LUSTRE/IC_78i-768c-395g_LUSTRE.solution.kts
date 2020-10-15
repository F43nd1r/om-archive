
solution {
    puzzle = "P090"
    name = "B ICX 1-3T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 7 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 9 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 10 to -2
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 9 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -3 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -2 to -1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 2 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 7 to 2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 2 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 8 to 0
        rotation = 7
    }
    glyph(UNIFICATION) {
        position = 10 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    track {
        position = 10 to -2
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 7 to 2
        positions = listOf(0 to 0, -1 to 0)
    }
    conduit {
        id = 100
        position = -2 to 0
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
                wait(13)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(5)
                retract()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                retract()
                wait(4)
                back()
                drop()
                extend()
                extend()
            }
        }
        , 
        {
            sequence(6) {
                wait(10)
                grab()
                retract()
                drop()
                extend()
                wait(7)
                grab()
                retract()
                drop()
                wait(11)
                grab()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(18)
                grab()
                retract()
                retract()
                drop()
                extend()
                extend()
            }
        }
        , 
        {
            sequence(1) {
                wait(15)
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(30)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(28)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(3) {
                wait(17)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(41)
                back()
                drop()
                grab()
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(42)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                drop()
            }
        }
        )
    }
}
