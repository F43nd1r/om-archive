
solution {
    puzzle = "P075"
    name = "INSTRUCTIONS"
    arm(ARM6) {
        number = 1
        position = -3 to 4
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 7 to 4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 9 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 7 to 6
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to 3
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 6 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 6 to 6
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = 6 to 3
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 8 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 8 to 2
        rotation = -2
    }
    io(OUTPUT) {
        index = 2
        position = 9 to 3
        rotation = -1
    }
    conduit {
        id = 100
        position = -2 to 4
        rotation = 0
    }
    conduit {
        id = 100
        position = 7 to 5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(7)
                grab()
                rotateClockwise()
                drop()
                wait(14)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(26)
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                extend()
            }
        }
        , 
        {
            sequence(5) {
                wait(366)
                grab()
                wait(6)
                drop()
                wait(2)
                grab()
                wait(9)
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(199)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
