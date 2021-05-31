
solution {
    puzzle = "w2450512232"
    name = "B ICX PENTAPIG 1-8T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 6 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to 2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -2 to 3
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 3 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 6 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to -2
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -3 to 2
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -2 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -1 to 3
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 5 to 2
        rotation = 3
    }
    glyph(ANIMISMUS) {
        position = -1 to -1
        rotation = 2
    }
    glyph(DISPOSAL) {
        position = 8 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 0 to -3
        rotation = 3
    }
    track {
        position = -2 to 1
        positions = listOf(-1 to 1, -1 to 2, 0 to 1, 0 to 0)
    }
    track {
        position = 6 to -3
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -1 to 2
        positions = listOf(-1 to 1, 0 to 0, 0 to 1)
    }
    conduit {
        id = 100
        position = 3 to 3
        rotation = 0
    }
    conduit {
        id = 100
        position = 1 to 2
        rotation = 4
    }
    conduit {
        id = 101
        position = -1 to 1
        rotation = 0
    }
    conduit {
        id = 101
        position = 6 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(2) {
                wait(21)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                back()
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(17)
                grab()
                rotateClockwise()
                retract()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                retract()
                extend()
                forward()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(10)
                grab()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                retract()
                drop()
                extend()
                forward()
            }
        }
        )
    }
}
