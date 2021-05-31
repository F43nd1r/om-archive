
solution {
    puzzle = "P095"
    name = "OVERLAP COST"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
